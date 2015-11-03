# WebJavaTemplate
a project that exposes a POJO on the web

Place your logic in the class "YourClass".

## Building the code
    type "gradle clean war" from the command line
    this will create a build/libs/WebJavaTemplate.war file that you can deploy to your jetty instance.


## Running the code
You can now run the class in one of 3 ways;

- You can run things manually (on the command line) by running class "Main".
    you will be asked to enter numbers at the command prompt
    
- You can then test that logic by adding tests to "YourClassTest"
    you can test that YourClass is correct by writing tests for each different case you can think of
     
- You can run your code thru the web
    hit a url like the following; http://localhost:8085/WebJavaTemplate/guesser?a=1&b=2&guess=3
    notice the parameters in the url and the port "8085". The port might be different for you.
    

TODO: a class that will allow YourClass to be triggered by a URL.


## Technologies:
### Jersey framework ( https://jersey.java.net/)
Allows pojos to be annotated to let them consume/produce web output.
Dont confuse this with Jetty
### Jetty (http://www.eclipse.org/jetty/)
A lightweight container that allows you to run java code.
