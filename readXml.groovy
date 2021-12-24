import groovy.xml.*;

def file = getClass().getResourceAsStream("/data/fells_loop.gpx");
def slurper = new XmlSlurper()
def gpx = slurper.parse(file)

println "Name is ${gpx.name}"
println "Description is ${gpx.desc}"

gpx.rte.rtept.each({
    println "Lattitude : ${it.@lat}"
    println "Lattitude : ${it.@lon}"
    println "Name : ${it.name}"
    println "Descritpion : ${it.desc}"
    println "Time : ${it.time}"
})
