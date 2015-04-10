#FizzBuzz

This incredibly simple little program is in response to the post here: http://blog.codinghorror.com/why-cant-programmers-program/

I had seen this post before, and dismissed it as rather silly. But it came to my attention again, and this time I read some of the answers in the comments.

An astounding number of them were incorrect. Not because of any inability to program on the authors' parts, but because they failed to fully answer the question.

At the time I sampled the answers, fewer than half of them correctly printed the number if the number was not divisible by either 3 or 5. To me this suggests that they 
saw the programmatically "interesting" branching logic based on multiples of 3s and 5s and focused on that, ignoring the remainder of the (more mundane) requirements.

So I felt the need to write this and post it in my profile. I'll admit it took me about eight minutes and I had to compile it twice, but only because I haven't worked
 in basic Java for a long time and forgot to capitalize System and had to check the docs to see if I needed to use the c-style "%d".