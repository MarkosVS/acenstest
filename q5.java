// Questão 05 - Processo Seletivo Acens
/**
* @author Marcos Vinicius dos Santos Sombra
*/
class Q5 {
	public static void main (String[] args){
		// declaracao e preenchimento do Array de numeros
		String[] lista = new String[200];
		lista[0] = "213752";
		lista[1] = "216732";
		lista[2] = "221063";
		lista[3] = "221545";
		lista[4] = "225583";
		lista[5] = "229133";
		lista[6] = "230648";
		lista[7] = "233222";
		lista[8] = "236043";
		lista[9] = "237330";
		lista[10] = "239636";
		lista[11] = "240138";
		lista[12] = "242123";
		lista[13] = "246224";
		lista[14] = "249183";
		lista[15] = "252936";
		lista[16] = "254711";
		lista[17] = "257200";
		lista[18] = "257607";
		lista[19] = "261424";
		lista[20] = "263814";
		lista[21] = "266794";
		lista[22] = "268649";
		lista[23] = "273050";
		lista[24] = "275001";
		lista[25] = "277606";
		lista[26] = "278997";
		lista[27] = "283331";
		lista[28] = "287104";
		lista[29] = "287953";
		lista[30] = "289137";
		lista[31] = "291591";
		lista[32] = "292559";
		lista[33] = "292946";
		lista[34] = "295180";
		lista[35] = "295566";
		lista[36] = "297529";
		lista[37] = "300400";
		lista[38] = "304707";
		lista[39] = "306931";
		lista[40] = "310638";
		lista[41] = "313595";
		lista[42] = "318449";
		lista[43] = "319021";
		lista[44] = "322082";
		lista[45] = "323796";
		lista[46] = "326266";
		lista[47] = "326880";
		lista[48] = "327249";
		lista[49] = "329914";
		lista[50] = "334392";
		lista[51] = "334575";
		lista[52] = "336723";
		lista[53] = "336734";
		lista[54] = "338808";
		lista[55] = "343269";
		lista[56] = "346040";
		lista[57] = "350113";
		lista[58] = "353631";
		lista[59] = "357154";
		lista[60] = "361633";
		lista[61] = "361891";
		lista[62] = "364889";
		lista[63] = "365746";
		lista[64] = "365749";
		lista[65] = "366426";
		lista[66] = "369156";
		lista[67] = "369444";
		lista[68] = "369689";
		lista[69] = "372896";
		lista[70] = "374983";
		lista[71] = "375223";
		lista[72] = "379163";
		lista[73] = "380712";
		lista[74] = "385640";
		lista[75] = "386777";
		lista[76] = "388599";
		lista[77] = "389450";
		lista[78] = "390178";
		lista[79] = "392943";
		lista[80] = "394742";
		lista[81] = "395921";
		lista[82] = "398644";
		lista[83] = "398832";
		lista[84] = "401149";
		lista[85] = "402219";
		lista[86] = "405364";
		lista[87] = "408088";
		lista[88] = "412901";
		lista[89] = "417683";
		lista[90] = "422267";
		lista[91] = "424767";
		lista[92] = "426613";
		lista[93] = "430474";
		lista[94] = "433910";
		lista[95] = "435054";
		lista[96] = "440052";
		lista[97] = "444630";
		lista[98] = "447852";
		lista[99] = "449116";
		lista[100] = "453865";
		lista[101] = "457631";
		lista[102] = "461750";
		lista[103] = "462985";
		lista[104] = "463328";
		lista[105] = "466458";
		lista[106] = "469601";
		lista[107] = "473108";
		lista[108] = "476773";
		lista[109] = "477956";
		lista[110] = "481991";
		lista[111] = "482422";
		lista[112] = "486195";
		lista[113] = "488359";
		lista[114] = "489209";
		lista[115] = "489388";
		lista[116] = "491928";
		lista[117] = "496569";
		lista[118] = "496964";
		lista[119] = "497901";
		lista[120] = "500877";
		lista[121] = "502386";
		lista[122] = "502715";
		lista[123] = "507617";
		lista[124] = "512526";
		lista[125] = "512827";
		lista[126] = "513796";
		lista[127] = "518232";
		lista[128] = "521455";
		lista[129] = "524277";
		lista[130] = "528496";
		lista[131] = "529345";
		lista[132] = "531231";
		lista[133] = "531766";
		lista[134] = "535067";
		lista[135] = "535183";
		lista[136] = "536593";
		lista[137] = "537360";
		lista[138] = "539055";
		lista[139] = "540582";
		lista[140] = "543708";
		lista[141] = "547492";
		lista[142] = "550779";
		lista[143] = "551595";
		lista[144] = "556493";
		lista[145] = "558807";
		lista[146] = "559102";
		lista[147] = "562050";
		lista[148] = "564962";
		lista[149] = "569677";
		lista[150] = "570945";
		lista[151] = "575447";
		lista[152] = "579937";
		lista[153] = "580112";
		lista[154] = "580680";
		lista[155] = "582458";
		lista[156] = "583012";
		lista[157] = "585395";
		lista[158] = "586244";
		lista[159] = "587393";
		lista[160] = "590483";
		lista[161] = "593112";
		lista[162] = "593894";
		lista[163] = "594293";
		lista[164] = "597525";
		lista[165] = "598184";
		lista[166] = "600455";
		lista[167] = "600953";
		lista[168] = "601523";
		lista[169] = "605761";
		lista[170] = "608618";
		lista[171] = "609198";
		lista[172] = "610141";
		lista[173] = "610536";
		lista[174] = "612636";
		lista[175] = "615233";
		lista[176] = "618314";
		lista[177] = "622752";
		lista[178] = "626345";
		lista[179] = "626632";
		lista[180] = "628889";
		lista[181] = "629457";
		lista[182] = "629643";
		lista[183] = "633673";
		lista[184] = "637656";
		lista[185] = "641136";
		lista[186] = "644176";
		lista[187] = "644973";
		lista[188] = "647617";
		lista[189] = "652218";
		lista[190] = "657143";
		lista[191] = "659902";
		lista[192] = "662224";
		lista[193] = "666265";
		lista[194] = "668010";
		lista[195] = "672480";
		lista[196] = "672695";
		lista[197] = "676868";
		lista[198] = "677125";
		lista[199] = "678315";
		int i = 0;
		int contador = 0;
		//inicio do loop
		while(i < lista.length){
			// testa se o primeiro e o ultimo digito sao iguais
			if(lista[i].charAt(0) != lista[i].charAt(5)){
				// transforma os caracteres em strings e depois em inteiros
				String x = String.valueOf(lista[i].charAt(0));
				String xx = String.valueOf(lista[i].charAt(1));
				String xxx = String.valueOf(lista[i].charAt(2));
				String y = String.valueOf(lista[i].charAt(3));
				String yy = String.valueOf(lista[i].charAt(4));
				String yyy = String.valueOf(lista[i].charAt(5));
				int a = Integer.parseInt(x);
				int b = Integer.parseInt(xx);
				int c = Integer.parseInt(xxx);
				int d = Integer.parseInt(y);
				int e = Integer.parseInt(yy);
				int f = Integer.parseInt(yyy);
				// testa se a soma dos digitos é par
				if((a+b+c+d+e+f)%2 == 0){
					// testa se há caracteres repetidos
					if(a != b && b != c && c != d && d != e && e != f){
						System.out.println(lista[i]);
						contador++;
					}
				}
			}
			i++;
		}
		System.out.println("Existem " + contador + " números possíveis");
	}		
}
