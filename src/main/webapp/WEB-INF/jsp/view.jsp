<%@ include file="init.jsp" %>

<h1><liferay-ui:message key="liferay7springmvcportlet.sayHello" arguments="${user.firstName}" /></h1>

<table bgcolor="#00FF00">
  <tr>
    <th>شماره</th>
    <th>عنوان فاکتور</th>
    <th>تاریخ</th>
    <th>مبلغ</th>
    <th>وضعیت پرداخت</th>
  </tr>
  <c:forEach items="${blist}" var="entry">
   <tr>
       <td><b>${entry.getId()}</b> :</td>
       <td><b>${entry.getTitle()}</b> :</td>
       <td><b>${entry.getDt()}</b> :</td>
       <td><b>${entry.getPrice()}</b> :</td>
       <td><b>${entry.getRefrenceid()}</b> :</td>
     </tr>

  </c:forEach>

</table>