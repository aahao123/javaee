<%--
  Created by IntelliJ IDEA.
  User: wpc
  Date: 15/12/10
  Time: 下午2:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../taglib.jsp"%>
<html>
<head>
    <title>JSTL标签 fmt:formatNumber 用法</title>
</head>
<body>

<h3>Number Format:</h3>
<c:set var="balance" value="120000.2309"></c:set>
<%--货币形式显示--%>
<p>Formatted Number (1):<fmt:formatNumber value="${balance}" type="currency"></fmt:formatNumber></p>
<%--显示小数点前几位--%>
<p>Formatted Number (2):<fmt:formatNumber value="${balance}" type="number" maxIntegerDigits="5"></fmt:formatNumber></p>
<%--显示小数点后几位--%>
<p>Formatted Number (3):<fmt:formatNumber value="${balance}" type="number" maxFractionDigits="2"></fmt:formatNumber></p>
<%--是否逗号分割--%>
<p>Formatted Number (4):<fmt:formatNumber value="${balance}" type="number" groupingUsed="false"></fmt:formatNumber></p>
<%--百分数--%>
<p>Formatted Number (5):<fmt:formatNumber value="${balance}" type="percent" maxIntegerDigits="3"></fmt:formatNumber></p>
<p>Formatted Number (5):<fmt:formatNumber value="${balance}" type="percent" minIntegerDigits="3"></fmt:formatNumber></p>
<p>Formatted Number (5):<fmt:formatNumber value="${balance}" type="percent" minFractionDigits="10"></fmt:formatNumber></p>



</body>
</html>
