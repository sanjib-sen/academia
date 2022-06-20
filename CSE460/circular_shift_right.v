module shift_right(load, d, q, clk);
	input clk, load;
	input [3:0] d;
	
	output reg [3:0] q;
	
	always @ (posedge clk)
	begin
		if(load)
			q<=d;
		else
		begin
			q[3] <= q[0];
			q[2] <= q[3];
			q[1] <= q[2];
			q[0] <= q[1];
		end
	end

endmodule