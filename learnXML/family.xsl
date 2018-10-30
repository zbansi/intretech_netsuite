<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:a="http://www.bansi.com/schemas/family D:\workspaceNS\learnXML\family.xsd">
	<xsl:output method="xml" version="1.0" encoding="UTF-8" omit-xml-declaration="no" indent="no" media-type="text/html"/>
	<xsl:template match="a:Family">
		<html>
			<head>
				<title>大家庭</title>
			</head>
			<body>
				<table>
					<tr>
						<th>
							<xsl:value-of select="FamilyName"/>
						</th>
					</tr>
				</table>
				<table>
					<xsl:for-each select="FamilyMember">
						<tr>
							<td>
								<xsl:value-of select="Name"/>
							</td>
							<td>
								<xsl:value-of select="Gender"/>
							</td>
							<td>
								<xsl:value-of select="Birthday"/>
							</td>
							<td>
								<xsl:apply-templates select="Address"/>
							</td>
							<td>
								<xsl:value-of select="Age"/>
							</td>
						</tr>
					</xsl:for-each>
				</table>
			</body>
		</html>
	</xsl:template>
	<xsl:template match="Address">
		<table>
			<tr>
				<td>
					<xsl:value-of select="Contury"/>
				</td>
				<td>
					<xsl:value-of select="Province"/>
				</td>
				<td>
					<xsl:value-of select="City"/>
				</td>
				<td>
					<xsl:value-of select="Address1"/>
				</td>
			</tr>
		</table>
	</xsl:template>
</xsl:stylesheet>
