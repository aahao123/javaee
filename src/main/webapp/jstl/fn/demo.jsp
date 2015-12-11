<%--
  Created by IntelliJ IDEA.
  User: wpc
  Date: 15/12/9
  Time: 下午10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../taglib.jsp" %>
<html>
<head>
    <title>fn:toUpperCase()函数</title>
</head>
<body>

<c:set var="string1" value="this is jsp page"/>
<%--将字符串转为大写字符--%>
<c:set var="string2" value="${fn:toUpperCase(string1)}"/>
<%--将字符串转为小写字符--%>
<c:set var="string3" value="${fn:toLowerCase(string1)}"/>
<%--截取并返回指定字符串之前的字符串--%>
<c:set var="string4" value="${fn:substringBefore(string1, 'jsp')}"/>
<%--截取并返回指定字符串之后的字符串--%>
<c:set var="string5" value="${fn:substringAfter(string1, 'jsp')}"/>
<%--截取并返回指定区间的字符串--%>
<c:set var="string6" value="${fn:substring(string1,3,5)}"/>
<c:set var="string7" value="This is first String."/>
<c:set var="string8" value="This <abc>is second String.</abc>"/>
<%--拆分数组--%>
<c:set var="string9" value="${fn:split(string1, ' ')}"></c:set>
<%--连接数组--%>
<c:set var="string10" value="${fn:join(string9, '-')}"></c:set>
<%--替换--%>
<c:set var="string11" value="${fn:replace(string1, 'jsp', 'hello')}"/>

<p>Final String:${string2}</p>

<p>Final String:${string3}</p>

<p>Final String:${string4}</p>

<p>Final String:${string5}</p>

<p>Final String:${string6}</p>

<%--判断字符串是否以某字串开头--%>
<c:if test="${fn:startsWith(string1, 'this')}">
    <p>String1 starts with this</p>
</c:if>
<%--判断字符串是否以某字串结尾--%>
<c:if test="${fn:endsWith(string1, 'page')}">
    <p>String1 ends with page</p>
</c:if>

<%--转义字符，可以解释为xml标记--%>
<p>With escapeXml() Function:</p>

<p>string7:${fn:escapeXml(string7)}</p>

<p>string8:${fn:escapeXml(string8)}</p>

<p>WithOut escapeXml() Function:</p>

<p>string7:${string7}</p>

<p>string8:${string8}</p>

<%--返回字串在字符串中的位置--%>
<p>index (1):${fn:indexOf(string1, 'jsp')}</p>

<p>Final String : ${string10}</p>

<p>String10 length:${fn:length(string10)}</p>

<p>String11:${string11}</p>

<%--判断指定字符串是否包含字串--%>
<c:if test="${fn:contains(string1, 'is')}">
    <p>string1 contains is</p>
</c:if>
<c:if test="${fn:containsIgnoreCase(string1, 'IS')}">
    <p>string1 containsIgnoreCase IS</p>
</c:if>
</body>
</html>
