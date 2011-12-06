Flow
====
Flow is a query/analysis language for the DataStreamMiner complex event processing system developed at
the Distributed Systems Lab (Dopsy) at Hochschule RheinMain.

Installation from git
---------------------
1. Clone the repository:

		git clone git://github.com/mfrey/flow.git

2. Install the dependencies for your distribution (packages names can differ):

	* maven (>= 3.0)
	* tycho (>= 0.11.0)
	* eclipse (>= 3.7)
	* eclipse delta pack (>= 3.7)

3. Configure the software (especially maven/tycho and eclipse). Please, be refered to the documentation of the
corresponding software.

4. Install the following eclipse plugins:
	- Install the following plugins
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
			- m2e Maven Integration for Eclipse

4. Then run the standard maven command to build the eclipse product:

		mvn package

Bug tracker
-----------
Have a bug or feature request? Please create an issue here on GitHub!

https://github.com/mfrey/flow/issues

License
-------
tba.

