@Grapes(
    @Grab(group='joda-time', module='joda-time', version='2.3')
)
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import groovy.xml.*;

def file = getClass().getResourceAsStream("/data/fells_loop.gpx");
def slurper = new XmlSlurper()
def gpx = slurper.parse(file)
def markupBuilder = new StreamingMarkupBuilder();


gpx.rte.rtept.each({route->
    def printableTime = new DateTime(route.time.toString());
    def format = DateTimeFormat.forPattern('MM/dd/YYYY HH:mm aa');
    println printableTime.toString(format);
})
