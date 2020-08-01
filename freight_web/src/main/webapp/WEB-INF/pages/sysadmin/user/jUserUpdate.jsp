<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../base.jsp"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>用户修改界面</title>
	<script language="javascript" src="${ctx}/js/jquery.min.js"/>
	<script type="text/javascript" src="${ctx}/js/ztree-all.js"></script>
	<script type="text/javascript" src="${ctx}/js/ztree-core.js"></script>
	<script type="text/javascript" src="${ctx}/js/jquery.ztree.excheck.js"></script>
	<link rel="stylesheet" href="${ctx}/css/zTreeStyle/zTreeStyle.css" type="text/css">
	<SCRIPT LANGUAGE="JavaScript">
		var userId = '';
		//点击事件
		function zTreeOnClick(event, treeId, treeNode) {
			alert(treeNode.id + ", " + treeNode.name);
		}

		//勾选事件
		function zTreeOnCheck(event, treeId, treeNode) {
			//alert(treeNode.id + ", " + treeNode.name + "," + treeNode.checked);
			if(treeNode.checked){
		        //首先判断是否选择的自己
                if(treeNode.id == userId){
                    //修改选择状态
                    zTreeObj.checkNode(treeNode,false,false,false);
                    alert('上级领导不能选择自己');
                }else {
                    $("#managerId").val(treeNode.id);
                    $("#managerName").val(treeNode.name);
                }
            }else {
                $("#managerId").val(null);
                $("#managerName").val('');
            }
		}

		var zTreeObj;
		// zTree 的参数配置，深入使用请参考 API 文档（setting 配置详解）
		//获取修改人id
		var setting = {
			async: {
				enable: true,
				dataType: "json",
				url: "userAction_degreeTree",
				autoParam: ["id"],
                otherParam: ["userId:".concat(userId)]
			},
			callback: {
				onClick: zTreeOnClick,
				onCheck: zTreeOnCheck
			},
			check: {
				enable: true,
				chkStyle: "radio",
				radioType: "level"
				//chkboxType: { "Y": "", "N": "" }
			}
		};
		// zTree 的数据属性，深入使用请参考 API 文档（zTreeNode 节点数据详解）
		$(document).ready(function(){
			console.log('hello world');
			userId = $('#userId').val();
			console.log("userId:".concat(userId));
			zTreeObj = $.fn.zTree.init($("#treeDemo"), setting);
		});
	</SCRIPT>

</head>

<body>
<form name="icform" method="post">
      <input type="hidden" name="userId" value="${u.userId}" id="userId"/>
	  <input type="hidden" name="userInfoId" value="${uf.userInfoId}"/>
<div id="menubar">
<div id="middleMenubar">
<div id="innerMenubar">
  <div id="navMenubar">
<ul>
<li id="save"><a href="#" onclick="formSubmit('userAction_update','_self');this.blur();">保存</a></li>
<li id="back"><a href="#" onclick="history.go(-1);">返回</a></li>
</ul>
  </div>
</div>
</div>
</div>
   
  <div class="textbox-title">
	<img src="${ctx }/skin/default/images/icon/currency_yen.png"/>
   查看用户
  </div> 
  

 
    <div>
		<table class="commonTable" cellspacing="1">
	        <tr>
	            <td class="columnTitle">所在部门：</td>
	             <td class="tableContent">
					 <select name="deptId">
						 <option value="">--请选择--</option>
						 <c:forEach items="${ds}" var="d">
							 <option ${u.deptId==d.deptId?'selected':''} value="${d.deptId}">${d.deptName}</option>
						 </c:forEach>
					 </select>
	            </td>
	        </tr>		
	        <tr>
	            <td class="columnTitle">用户名：</td>
	            <td class="tableContent"><input type="text" name="userName" value="${u.userName }"/></td>
	        </tr>	
	         <tr>
	            <td class="columnTitle">状态：</td>
	            <td class="tableContentAuto">
	              <input type="radio" name="state" class="input" ${u.state==0?'checked':'' } value="0">停用
	              <input type="radio" name="state" class="input"  ${u.state==1?'checked':'' } value="1">启用
	            </td>
                 <td class="columnTitle">请选择上级领导：</td>
                 <td class="tableContent">
                     <ul id="treeDemo" class="ztree"></ul>
                 </td>
	        </tr>
			<tr>
				<td class="columnTitle">姓名：</td>
				<td class="tableContent"><input type="text" name="name" value="${uf.name}"/></td>
				<td class="columnTitle">直属领导：</td>
				<td class="tableContent">
					<%--<select name="managerId">
						<option value="">--请选择--</option>
						<c:forEach items="${uis}" var="ui">
							<option ${uf.managerId==ui.userInfoId?'selected':''} value="${ui.userInfoId}">${ui.name}</option>
						</c:forEach>
					</select>--%>
						<input  name="managerId" hidden value="${uf.managerId}" id="managerId">
                        <input name="managerName" class="input" id="managerName">
				</td>
			</tr>
			<tr>
				<td class="columnTitle">入职时间：</td>
				<td class="tableContent">
					<input type="date"  name="joinDate"
						   value="<fmt:formatDate value='${uf.joinDate}' pattern='yyyy-MM-dd' />" />
				</td>
				<td class="columnTitle">薪水：</td>
				<td class="tableContent"><input type="text" name="salary" value="${uf.salary}"/></td>
			</tr>
			<tr>
				<td class="columnTitle">等级：</td>
				<td class="tableContentAuto">
					<input type="radio" name="degree" ${uf.degree==0?"checked":""} value="0" class="input"/>超级管理员
					<input type="radio" name="degree" ${uf.degree==1?"checked":""}  value="1" class="input"/>跨部门跨人员
					<input type="radio" name="degree" ${uf.degree==2?"checked":""}  value="2" class="input"/>管理所有下属部门和人员
					<input type="radio" name="degree" ${uf.degree==3?"checked":""}  value="3" class="input"/>管理本部门
					<input type="radio" name="degree" ${uf.degree==4?"checked":""}  value="4" class="input"/>普通员工
				</td>
				<td class="columnTitle">性别：</td>
				<td class="tableContentAuto">
					<input type="radio" name="gender"  ${uf.gender==1?"checked":""}  value="1" class="input"/>男
					<input type="radio" name="gender" ${uf.gender==0?"checked":""}  value="0" class="input"/>女
				</td>
			</tr>
			<tr>
				<td class="columnTitle">岗位：</td>
				<td class="tableContent"><input type="text" name="station" value="${uf.station}"/></td>
				<td class="columnTitle">电话：</td>
				<td class="tableContent"><input type="text" name="telephone" value="${uf.telephone}"/></td>
			</tr>
			<tr>
				<td class="columnTitle">邮箱：</td>
				<td class="tableContent"><input type="text" name="email" /></td>
				<td class="columnTitle">出生年月：</td>
				<td class="tableContent">
					<input type="date"  name="birthday"
						   value="<fmt:formatDate value='${uf.birthday}' pattern='yyyy-MM-dd' />"
					/>
				</td>
			</tr>
			<tr>
				<td class="columnTitle">排序号：</td>
				<td class="tableContent"><input type="text" name="orderNo" value="${uf.orderNo}"/></td>
				<td class="columnTitle">说明：</td>
				<td class="tableContent">
					<textarea name="remark" style="height:120px;">${uf.remark}</textarea>
				</td>
			</tr>
		</table>
	</div>
 </form>
</body>
</html>