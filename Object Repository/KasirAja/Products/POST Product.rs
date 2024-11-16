<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>POST Product</name>
   <tag></tag>
   <elementGuidId>512db464-95e6-4a88-a056-01429564ba06</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;category_id\&quot; : \&quot;${categoryId}\&quot;,\n    \&quot;code\&quot;: \&quot;A314ASDDFIER3432\&quot;,\n    \&quot;name\&quot;: \&quot;taro\&quot;,\n    \&quot;price\&quot;: \&quot;3500\&quot;,\n    \&quot;cost\&quot;: \&quot;3000\&quot;,\n    \&quot;stock\&quot;: \&quot;1\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <katalonVersion>8.6.9</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${host}/products</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.host</defaultValue>
      <description></description>
      <id>9de2b9e2-2d05-4c45-9c24-3ae884f4fb9d</id>
      <masked>false</masked>
      <name>host</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.categoryId</defaultValue>
      <description></description>
      <id>9c4693a9-a864-461a-a85c-30bcad5888a6</id>
      <masked>false</masked>
      <name>categoryId</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
