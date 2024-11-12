f = open("user.out", 'w')
for nums, tar in zip(stdin, stdin):
    tar = int(tar.rstrip())
    a = nums.rstrip()[1:-1].split(',')
    i = bisect_left(a, True, key=lambda x: int(x) >= tar)
    print(i if i < len(a) and int(a[i]) == tar else -1, file=f)
exit(0)
