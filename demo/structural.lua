fm = get_instance();
a = fm:create_operator_of_type("a", "CacheIn");
a:set_parameter("list_iris", "http://www.test.de ");
a:set_parameter("connector_socket_address", "localhost");
a:set_parameter("connector_socket_port", "9595");
b = fm:create_operator_of_type("b", "CacheIn");
b:set_parameter("list_iris", "http://www.anothertest.de ");
b:set_parameter("connector_socket_address", "localhost");
b:set_parameter("connector_socket_port", "9596");
c = fm:create_operator_of_type("c", "Merge");
fm:connect_operators(c, "out", a, "in0");
fm:connect_operators(c, "out", b, "in1");
d = fm:create_operator_of_type("d", "ElementMerge");
d:set_parameter("name", "o");
d:set_parameter("type", "number");
d:set_parameter("value", "42");
fm:connect_operators(d, "out", c, "in");
g = fm:create_operator_of_type("g", "Split");
fm:connect_operators(g, "out0", d, "in");
fm:connect_operators(h, "out1", d, "in");
i = fm:create_operator_of_type("i", "Filter");
i:set_parameter("operatortype", ">=");
i:set_parameter("operand", "right");
i:set_parameter("type", "number");
i:set_parameter("type", "42");
i:set_parameter("operand", "left");
i:set_parameter("stream", "g");
i:set_parameter("element", "oNew");
fm:connect_operators(i, "out", g, "in");
fm:start(g);
fm:start(d);
fm:start(b);
fm:start(c);
fm:start(a);
fm:start(i);
fm:stop(g);
fm:stop(d);
fm:stop(b);
fm:stop(c);
fm:stop(a);
fm:stop(i);
