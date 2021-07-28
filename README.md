# Customizing checkstyle
Your organization decided to adjust some specific rules in set of rules that you currently use. You're asked to make those changes

## Import your set of rules
You'll find an XML file in the directory src/main/resources. To import this, open the CheckStyle configuration and add the file to the list of configurations.

* Go to File > Settings
* Go To Tools > Checkstyle
* Change the Checkstyle version to 8.44 
* Add (+) a new Configuration File and select the XML file in the resources folder.
  * Skip the next dialog by pressing next.
* Activate the new configuration by selecting the checkbox next to it.  

## Requirements
Your team decided on the following changes:

* Javadoc comments for public classes not be enforced anymore.
* References to methods and variables of the current object explicitly require a "this" (e.g. this.methodName()).
* The maximum line length should be raised to 160, since all developers got new monitors recently.
* Methods should be no longer than 10 lines each.

Take a look at the CheckStyle documentation and find out which values need changing.  