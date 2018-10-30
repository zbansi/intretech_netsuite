<?xml version="1.0" encoding="gb2312"?>
<xsl:stylesheet version="1.0" xmlns:a="http://www.bansi.com/schemas/family" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html" version="1.0" encoding="gb2312" indent="yes"/>
	<xsl:template match="/">
		<html>
			<head>
				<title>大家庭</title>
			</head>
			<body>
				<table border="1">
					<xsl:for-each select="a:FamilySet/Family">
						<tr bgcolor="#9acd32">
							<td>
								<xsl:value-of select="FamilyName"/>
							</td>
						</tr>
						<tr>
							<th>姓名</th>
							<th>性别</th>
							<th>出生日期</th>
							<th>住址</th>
							<th>年龄</th>
						</tr>
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
