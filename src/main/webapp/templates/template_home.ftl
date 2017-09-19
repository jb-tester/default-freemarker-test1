<html>
<head>
    <title>FreeMarker test1</title>
</head>
<body>
<div id="content">
    <#assign title="${home_attr1}"/>
    <h2>${title}</h2>
    <br/>
    <h1>tested configurations:</h1>
    <table border="1">
        <tr>
            <th >view resolver</th>  <th>status</th>
        </tr>
    <#list viewresolversList as vr>
    <tr>
        <td>${vr.name}</td> <td align="center">${vr.status}</td>
    </tr>
    </#list>
    </table>
</div>
<a href="/test2">continue...</a>
</body>
</html>