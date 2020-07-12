$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Login.feature");
formatter.feature({
  "name": "Sending message",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://accounts.google.com/signin\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"mo7amdtare2@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_Email_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Next",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Next()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Password as \"7amok4aaa\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_Password_as(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\u0027password\u0027]/div[1]/div/div[1]/input\"}\n  (Session info: chrome\u003d83.0.4103.116)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-RC8IGGF\u0027, ip: \u0027192.168.2.102\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.116, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\moham\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:50213}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: bf04d661d301b21b4bc6e0fdb6a073d3\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\u0027password\u0027]/div[1]/div/div[1]/input}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.clear(Unknown Source)\r\n\tat pageObjects.LoginPage.setPassword(LoginPage.java:64)\r\n\tat stepDefinitions.Steps.user_enters_Password_as(Steps.java:38)\r\n\tat ✽.User enters Password as \"7amok4aaa\"(file:Features/Login.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User is logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_is_logged_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click on Compose",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_Compose()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User sends email to \"mogeza1997@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_sends_email_to(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User writes email subject \"CucumberTest\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_writes_email_subject(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User writes content \"Hello How are you doing cucumber? \"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_writes_content(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click on Send",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_Send()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "sending message process is completed",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.sending_message_process_is_completed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});