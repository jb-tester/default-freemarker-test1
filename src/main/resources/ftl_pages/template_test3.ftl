<html>
<head>
    <title>mod2_home</title>
</head>
<body>
<#list data as lst><#sep> ;
<#if lst=="" && test3_attr1!="">
    <#continue>
</#if>
<b>${lst_index}.</b> ${lst}
</#list>
</body>
</html>