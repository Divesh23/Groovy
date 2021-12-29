@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7.1')
import groovyx.net.http.HTTPBuilder

//GET
def apiCall = new RESTClient('https://postman-echo.com');
def path = '/get'
def response = apiCall.post(path :path);
println "${response}"
