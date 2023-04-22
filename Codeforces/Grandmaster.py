for _ in range(int(input())):
    swaps = 0
    troph = int(input())
    lamps = input()
    arr = []
    for i in lamps:
        arr.append(i)
    flag = False
    for i in range(troph-1):
        if((arr[i]+arr[i+1]) == "RL"):
            swaps = 0
        elif((arr[i]+arr[i+1]) == "LR"):
            swaps = i
        else:
            swaps = -1
    print(swaps)
