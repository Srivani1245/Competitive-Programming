def my_function(arg):

    # Write the body of your function here
    x=arg
    count=0
    k=14
    y=0
    while(y<x):
            z=y
            y=y+k
            k=k-1
            count=count+1
    if(x==y):
        return count
    count=count+(x-z)
    return count

    # return 'running with %s' % arg

# Run your function through some test cases here
# Remember: debugging is half the battle!
# print my_function('test input')
for i in range(1,100):
    print(my_function(i))

