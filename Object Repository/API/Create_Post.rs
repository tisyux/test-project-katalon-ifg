<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>Create post using JSONPlaceholder</description>
   <name>Create_Post</name>
   <tag></tag>
   <elementGuidId>7cb97e72-cf7b-45b7-93fd-1cf20312a715</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <httpBody>{
  "title": "Katalon Test",
  "body": "Simple API automation",
  "userId": 1
}</httpBody>
   <httpBodyContent>{
  "text": "{\n  \"title\": \"Katalon Test\",\n  \"body\": \"Simple API automation\",\n  \"userId\": 1\n}",
  "contentType": "application/json",
  "charset": "UTF-8"
}</httpBodyContent>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${baseUrl}/posts</restUrl>
   <serviceType>RESTful</serviceType>
   <variables>
      <defaultValue>'https://jsonplaceholder.typicode.com'</defaultValue>
      <description></description>
      <id>baseUrl</id>
      <masked>false</masked>
      <name>baseUrl</name>
   </variables>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>5815695e-d405-48cf-9fa9-b6e5876393d8</webElementGuid>
   </httpHeaderProperties>
</WebServiceRequestEntity>
