# sde-git-gla
Starting repo for Git/GitHub learning activity for SDE

## Instructions for the Git GLA.

The repository that was created when you accepted the assignment has 4 files in it: a README.md (this file), a build.gradle file, and a somewhat modified version of the MySet.java and MySetTest.java file from a JUnit demo that you have seen before.

You need to do the following:

* Create a branch and name it something meaningful.
* JUnit testing is disabled because the commands in build.gradle are commented out. Uncomment these lines, build your program and you'll see that two tests are failing.
* Correct the silly mistake in the test *addToEmpty()* in the the test file. Use gradle to make sure this test now passes.  (There's another one that's failing. Don't fix that yet.)
* Commit and push your branch back to GitHub.
* Create a pull request with comments to merge the branch.
* Merge the branch back into master.
* Create another new branch.
* Create a new .txt file in the project folder (doesn't matter what's in it, but put something there) and add it to the repo.
* Correct the silly error in *addlist()* in MySet.java.  Use gradle to make sure this test now passes.
* Commit the changes locally.
* Make another change to build.gradle: change the Java source compatability to be for Java 11 not Java 10.
* Commit the changes again.
* Create another pull request with comments to merge the branch.
* Merge the branch back into master.
* Don't delete your branches (or anything else with the process). We will be checking these!
