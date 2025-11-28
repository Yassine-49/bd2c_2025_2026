

<%@page import="bean.*" %>
<%@page import="java.util.*" %>


<html>
    <head>
        <title>Liste des villes</title>
        <LINK rel="stylesheet" type="text/css" href="Style.css">
    </head>
    <body class=standard>
        <TABLE border=0>
            <TR>
                <DIV class=Entete><P Class=titregros>Liste des villes</P></DIV>
                 <TD>
                    <table class='grid' border=5>
                    <tr class='entetegrid'><td>Nom</td><td>Nombre d'habitants</td></tr>
                    <% ListeVille villes=new ListeVille();
                    villes.lire();
                    for (Iterator iter=villes.getVilles().iterator(); iter.hasNext();)
                    {
                        Ville v = (Ville)iter.next();%>
                        <tr><td><%=v.getNom()%></td><td><%=v.getNbrhab()%></td>
                        </tr>
                  <%}%>
		</table>
               </TD>
            </TR>
        </TABLE>
    </body>
</html>

