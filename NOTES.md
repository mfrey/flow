NOTES
=====
0.0.1
-----
1. Installation:
	- Install the following plugins
		- null (todo)
			- Eclipse Modeling Tools
		- Eclipse Modeling Project
			- EMF Compare UML2 Integration
			- MWE 2 language SDK
			- MWE 2 runtime SDK
			- MWE SDK
			- OCL Examples and Editors
			- UML2 Extender SDK
			- Xpand SDK
			- Xtext SDK
		- Sonatype
			- Tycho Project Configurators
		- m2e
			-m2e Maven Integration for Eclipse

	- The plugins of the project are imported via the import functionality of eclipse. Please select from the "File" menu the entry "Import ..." > "Maven" > "Existing Maven Projects". Select as root directory the root of the project directory which contains the parent pom.xml. Select all projects for an import to your workspace. Usually the import process takes some time, especially in cases of a first initial import. 

2. Operators:
	- (arithmetic) expressions are written with the corresponding operator, e.g. add(...); 
	- operators which should be tested in terms of generated code are: avg, std, count, add, sub, 
        div, multi, join, split, in, out, log, rand, dtree, filter, mod, ejoin

3. Examples:
	- there is a examples/ directory for a few examples of operators and generated code

4. Known Issues:
	- sparql-, tag-, untag-, swrl- operators need to be implemented
	- scoping and generators interfere in a 'chaotic' way (see also bug report on github)
	- maven/tycho setup is broken
