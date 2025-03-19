# DVCS [Distributed Version Control System]
Software development takes ton of coding and many developers. It is also important that they collaborate together to make it possible. Version control systems are specific software that keeps track of changes as storing versions of file (as snapshots in GIT). Distributed VCS are the one's where everything is distributed instead of being in a central location. Every developer gets to copy the entire version history and the code together, then changes are made locally.

In GIT, clone a repository means copying the entire code base along with the local machine to the local device and then making changes locally. The changes then can be commited to the central repository for merging. 
- GIT is fast
- Doesn't require internet

Git handles code changes with security too. Every change is encoded with checksum file. That has SHA1 encrypted codec that matches with vesrion. In general, if there is any change made then git will know about it

GIT maintains three states:

1. **Modified**: The changed files, stored as snapshots.
2. **Stsged**: The modified files that are made available for the next commit. This state is also called indexed.
3. **Committed**: The data that is finally stored in the database.

![git states](./resources/file_lifecycle.jpg)

You can use git-config CLI tool that can set general configuration properties on your system.

```$ git config --list --show-origin```\
```$ git config --global user.name <specify username>```

## Project with GIT
There are two ways to start a project with GIT
1. Clone a repository.
2. Make a normal directory to be under git control.

Let's see for the second one. Navigate to the directory and run the few add commands and make the first commit.
# Math
## GCD (Greatest common divisor)
1. prime factorization method
2. Euclidean principle

```
public class Solution {
    public int gcd(int A, int B) {
        if(B == 0) return A;
        else return gcd(B, A%B);
    }
}
```