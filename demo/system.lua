fm = get_instance();
cacheIn = fm:create_operator_of_type("cacheIn", "CacheIn");
cacheIn:set_parameter("list_iris", "http://www.anothertest.de ");
cacheIn:set_parameter("connector_socket_address", "localhost");
cacheIn:set_parameter("connector_socket_port", "9595");
a = fm:create_operator_of_type("a", "Split");
fm:connect_operators(a, "out0", cacheIn, "in");
fm:connect_operators(b, "out1", cacheIn, "in");
cacheOut = fm:create_operator_of_type("cacheOut", "CacheOut");
cacheOut:set_parameter("list_iris", "http://www.anothertest.de ");
cacheOut:set_parameter("connector_socket_address", "localhost");
cacheOut:set_parameter("connector_socket_port", "9596");
logStream = fm:create_operator_of_type("logStream", "Log");
logStream:set_parameter("log_file_location", "generated3.txt");
logStream:set_parameter("log_format", "aal");
fm:connect_operators(logStream, "out", b, "in");
fm:start(logStream);
fm:start(a);
fm:start(cacheOut);
fm:start(cacheIn);
fm:stop(logStream);
fm:stop(a);
fm:stop(cacheOut);
fm:stop(cacheIn);
