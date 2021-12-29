@Grapes(
    @Grab(group='joda-time', module='joda-time', version='2.3')
)
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import groovy.xml.*;

class DateTimeCategory{
    static String createPrintableTime(dateTime,suffix){
        def format = DateTimeFormat.forPattern('MM/dd/YYYY HH:mm aa');
        dateTime.toString(format)+' '+suffix;
    }
}

def file = getClass().getResourceAsStream("/data/fells_loop.gpx");
def slurper = new XmlSlurper()
def gpx = slurper.parse(file)
def markupBuilder = new StreamingMarkupBuilder();

use(DateTimeCategory){
    gpx.rte.rtept.each({route->
        def printableTime = new DateTime(route.time.toString());
        println printableTime.createPrintableTime('Divesh');
    })
}

