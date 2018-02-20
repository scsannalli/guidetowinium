# guidetowinium
Step by Step Guide to use Winium

This repo has been setup to run notepad application and enter "Hello World!!" text


steps to config your own desktop application and start automation.

1. clone this repo
2. open this as a maven project using intelliJ / eclipse
3. from the resources folder unzip Winium.Desktop.Driver and run 'Winium.Desktop.Driver.exe'
4. Right click and run Sample_E2ETests located in src/test/java. This should open NotePad and auto type "Hello World!!!"
5. Now update app url in "src/data/env_data.conf". Provide path to your Desktop application
5. MainPageActions class in src/java/mainpage can be edited to start interacting with different elements on the Desktop App.
6. use tools provided in resources/gui-inspect-tools.zip to find element properties.
7. Right click and run Sample_E2ETests located in src/test/java

keep adding more tests and assertions for your Desktop application.  Modify file Sample_E2ETests and run your own tests.



