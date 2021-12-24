def isEven(num) { return num%2==0}

def range = 1..10
range.each({
    if(isEven(it))
    {
        println "$it"
    }
})