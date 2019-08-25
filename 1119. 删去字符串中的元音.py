def removeVowels(S: str) -> str:
    li=['a','e','i','o','u']
    s=list(S)
    for i in s:
        if i in li:
            s.remove(i)
    return "".join(s)       

a="ltcdscmmnityfrcders"
print(removeVowels(a))