x = int(input())
for i in range(x):
    [a,b,c] = [int(i) for i in input().split(" ")]
    m = max([a,b])
    mi = min([a,b])
    if m - mi != 0:
        print(c//(m-mi))
    else:
        print(c//(mi))