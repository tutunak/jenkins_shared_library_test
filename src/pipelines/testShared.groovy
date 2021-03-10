package pipelines


def MY_CONSTANT_VALUE = 'hello'

def doSomething() {
    // Nope, it won't compile.
    echo "${MY_CONSTANT_VALUE}"
}