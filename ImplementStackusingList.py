
class Stack:
  def __init__(self):
    self.st=[]

  def push(self, x):
    self.st.append(x)

  def pop(self):
    if self.isEmpty():
      return
    self.st.remove(self.st[-1])

  def isEmpty(self):
    return self.st==[]

  def peek(self):
    if self.isEmpty():
      return None
    return self.st[-1]

  def size(self):
    return len(self.st)

  def display(self):
    for i in self.st:
      print(i)

st=Stack()
st.push(1)
st.push(9)
st.push(3)
st.display()
# print(st)
st.pop()
# st.print(st)
print("peek: \n")
print(st.peek())
print("After: \n")
st.display()
st.push(6)
# print(st)
