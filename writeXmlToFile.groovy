import groovy.xml.*;

def file = getClass().getResourceAsStream("/data/fells_loop.gpx");
def slurper = new XmlSlurper()
def gpx = slurper.parse(file)
def markupBuilder = new StreamingMarkupBuilder();

def xml = markupBuilder.bind{
    RouteToCover{
        gpx.rte.rtept.each({route->
            DiveshsTestRoute(time:route.time.toString()){
                lattitude(route.@lat)
                longitude(route.@lon)
            }
        })
    }
}

def outputFile = new File("data/fells_write.gpx")
outputFile.write(xml.toString());
