import groovy.xml.*;

def file = getClass().getResourceAsStream("/data/fells_loop.gpx");
def slurper = new XmlSlurper()
def gpx = slurper.parse(file)

//println "Name is ${gpx.name}"
//println "Description is ${gpx.desc}"

gpx.with{
    println "Name is $name"
    println "Description is $desc"
    println "Version is :${attributes()['version']}"
}

gpx.rte.rtept.with{
    println ''
    println name
    println ''
    println desc
    println ''
}
