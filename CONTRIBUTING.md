# Contributing to Tablasco

This file contains information about reporting issues as well as contributing code. Make sure
you read our [Contributor Covenant Code of Conduct](CONTRIBUTOR_COVENANT.md) before you
start participating. If you're considering a larger piece of
work, start with an enhancement request and make sure committers are supportive of the work.

## Reporting Issues
Please use GitHub Issues for issue submission. We strongly prefer issues that have reproducible test cases.
To contribute a test case follow the same process as contributing a feature.

## Contributing Code
Code contributions are accepted via the normal GitHub pull request mechanism. Code must pass existing tests,
have its own set of tests, be formatted correctly and be consistent with the overall Tablasco vision.
It must follow the pull request procedure outlined below.

### Before your first code pull request

If you have never contributed to Tablasco, or your copyright ownership has changed, you must first create a pull request
that has a developer certificate of origin (DCO) in it. To create this file, follow these steps:

For code you write, determine who the copyright owner is. If you are employed in the US, it's likely that your
employer can exert copyright ownership over your work, even if the work was not done during regular working hours or
using the employer's equipment. Copyright law is highly variable from jurisdiction to jurisdiction. Consult your
employer or a lawyer if you are not sure.

If you've determined that the copyright holder for the code you write is yourself, 
please fill out the following (replace all `<>` terms); place it in a file under `dco/<your name>.dco`. 

```
1) I, <your name>, certify that all work committed with the commit message 
"covered by: <your name>.dco" is my original work and I own the copyright 
to this work. I agree to contribute this code under the Apache 2.0 license.

2) I understand and agree all contribution including all personal 
information I submit with it is maintained indefinitely and may be 
redistributed consistent with the open source license(s) involved. 

This certification is effective for all code contributed from <date submitted> to 9999-01-01.
```

If you've determined that the copyright holder for the code you write is some other entity (e.g. your employer), 
you must ensure that you are authorized by the copyright holder to be able to license this code under the 
Apache 2.0 license for the purpose of contribution to Tablasco. Negotiating such authorization and administering
the terms is entirely between you and the copyright holder. Please fill out the following (replace all
`<>` terms); place it in a file under `dco/<copyright holder name>-<your name>.dco`. 

```
1) I, <your name>, certify that all work committed with the commit message 
"covered by: <copyright holder name>-<your name>.dco" is copyright 
<copyright holder name> and that I am authorized by <copyright holder name> 
to contribute this code under the Apache 2.0 license.

2) I understand and agree all contribution including all personal 
information I submit with it is maintained indefinitely and may be 
redistributed consistent with the open source license(s) involved. 

This certification is effective for all code contributed from <date submitted> to 9999-01-01.
```

`<your name>` must reference your real name; we will not accept aliases, pseudonyms or anonymous contributions.
Issue a pull request with the appropriate DCO and a change to NOTICE.txt with
one line `This product contains code copyright <copyright holder name>, licensed under Apache 2.0 license`.

### Pull requests
When you create a code pull request, please follow these guidelines:
* Make sure you rebase your fork so that pull requests can be fast-forward merges.
* We generally prefer squashed commits, unless multi-commits add clarity or are required for mixed copyright commits.
* Your commit message for your code must contain a `covered by: <dco>` line. See above.
* Every file you modify should contain a single line with copyright information after the Apache header: 
```
//Portions copyright <copyright holder>. Licensed under Apache 2.0 license
```
* New files must contain the standard Apache 2.0 header with appropriate copyright holder.
* If you're going to contribute code from other open source projects, commit that code first with `covered by: <license>`
where `<license>` is license of the code being committed. Ensure the file retains its original copyright notice and add an appropriate line to 
NOTICE.txt in the same commit. You can then modify that code in subsequent commits with a reference to your DCO and copyright.
