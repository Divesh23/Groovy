int[] opportunites = new int[] { 500,600,700,800 }

println "For Loop Initialization"
for(int opportunity in opportunites){
    println "Opportunity is $opportunity"
}

println "Each Implemetation"
opportunites.each{ println "Opportunity is ${it}"}

println "Each With Lambda Implementation"
opportunites.each((opportunity) -> {
    println "Opportunity is ${opportunity}"
})


println "Each with Conditional Lamba Implemetation"
opportunites.each((opportunity) -> {
    if(opportunity>600){
        println "Opportunity is ${opportunity}"
    }
})