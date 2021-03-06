Vaer
===
[![Build Status](https://travis-ci.org/PartTimeHackerman/Vaer.svg?branch=master)](https://travis-ci.org/PartTimeHackerman/Vaer)
[![codebeat badge](https://codebeat.co/badges/3f460a22-3286-46b4-87b9-22611ead7113)](https://codebeat.co/projects/github-com-parttimehackerman-vaer-master)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/c320e7331b2f43689f464ed20be48ccd)](https://www.codacy.com/app/kuriozalnie/Vaer?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=PartTimeHackerman/Vaer&amp;utm_campaign=Badge_Grade)

Vaer is simple **va**riable watch**er**, allowing to watch, edit and freeze any variable in real time.
Default view is made in JavaFx, but it's easy to implement new one ( I'll implement another in JS in near future).

**Basic usage:**
```
Integer integer = 1;
...
/* Create structure like:
   Group 1
   |    Group 2
   |    |   Int Variable    =[ 123  ]    [ ] Freeze  Refresh rate: [ 200 ]   [X]
 */
Variable<Integer> vaeriable = Vaer.get()
					.group("Group 1")
					.group("Group 2")
					.variable("Int Variable");
vaeriable.setVariableSetter(this::set); //set integer setter
vaeriable.setVariableGetter(this::get); //set integer getter
vaeriable.setRefreshRate(200L); //set refresh rate in ms (default: 100ms)
```
**Tips for variables:**
```
//Get variable if exists, otherwise create new one with given name
variable("Int Variable");

//Create variable, if variable with given name already exists append _i to it's name (i is the number of repeated names)
variableNew("Int Variable");

//Getter/Freeze are invoked every refresh
setRefreshRate(200L);
```

**How to use:**
1. Go to https://jitpack.io/#PartTimeHackerman/Vaer
2. ...
3. Done! :)

**ToDo:**
- implementation of browser GUI in JS,
- implementation of `````@VaerVariable````` annotation processor for easy watching,
- some refactoring
- non-primitives/boxed wrapper with methods like ```? get()``` and ```set(? t)```
- TESTS!

