Repro Steps:

* Import this bazel workspace into ijwb
* It should run a sync automatically at import time

Expected:

* Bazel sync fails due to compile error.
* IntelliJ correctly marks project1/.../Module1.java as unable to compile

Actual:

* Sync fails due to compile error
* (BUG) IntelliJ incorrectly claims that Module1.java is OK. 