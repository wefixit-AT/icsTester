# icsTester

This tool pareses a ics file through net.fortuna.ical4j and print errors if parsing goes wrong.

I wrote this tool to sanitize files before importing to a [Zimbra](https://www.zimbra.com/) server which gives only the exception and in the logs are nothing helpful was logged.

## Compile

    gradle fatJar

## Run

    java -jar build/libs/icsTester-all.jar /path/to/file.ics

