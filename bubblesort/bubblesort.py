def bubblesort(list):
    n=len(list)
    for i in range(n-1):
        count=0
        for j in range(n-1-i):
            if list[j]>=list[j+1]:
                list[j],list[j+1]=list[j+1],list[j]
                count+=1
        if count==0:
            break
    return list
if __name__ == "__main__":
     list=[1,8,9,5,4,6,3,2,7]
     print(bubblesort(list))

    