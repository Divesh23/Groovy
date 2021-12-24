def range = 1..10
range.each((value)->{
    println "Values are : $value"
})

enum DAYS{
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday
}
def weekdays = DAYS.Monday..DAYS.Friday
println "From: ${weekdays.from}"
println "To: ${weekdays.to}"
weekdays.each({day->
    println "$day"
})

