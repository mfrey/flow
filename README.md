Flow
====
Flow is a query/analysis language for the [DataStreamMiner][1] complex event processing system developed at
the [Distributed Systems Lab (Dopsy)][2] at [Hochschule RheinMain][3]. 

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

4. Then run the standard maven command to build the eclipse product:

		mvn package

Bug tracker
-----------
Have a bug or feature request? Please create an issue here on GitHub!

https://github.com/mfrey/flow/issues

License
-------
tba.

[1]: https://wwwvs.cs.hs-rm.de/projekte/dsminer.html
[2]: https://wwwvs.cs.hs-rm.de
[3]: http://www.hs-rm.de/dcsm/studiengaenge/informatik-msc/index.html
