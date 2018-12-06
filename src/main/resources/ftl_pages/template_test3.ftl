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
<h2>!!!!!</h2>
<#function func1 param1=[]>
${[]?first!'No item was found'}
${[]?last!'No item was found'}
${[]?is_sequence?string}
${[]?join('::')}
<#if param1?has_content>
<div class="foo">
    ${param1?join(':::')}
    <#else>
    <div class="bar">
        <h2>----</h2>
        </#if>
    </div>
    <#return param1?last!'No item was found'>

    </#function>
    ${func1(['aaaaaa','bbbbbbb'])}


</body>
</html>