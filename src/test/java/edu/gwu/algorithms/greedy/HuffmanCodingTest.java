package edu.gwu.algorithms.greedy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;


public class HuffmanCodingTest {
    public static HashMap<Character, String> huffmanBinaryCodes = new HashMap<>();

    @Test
    public void main() {
        Iterator<Map.Entry<Character, String>> it;
        TreeNode root;
        String testString = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaddhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhdfffgiiijccjj";
        
        HuffmanEncoding huffEncd1 = new HuffmanEncoding();
        huffEncd1.getCharFreq(testString);
        huffEncd1.bldCharNodesPQ();
        huffEncd1.bldHuffmanTree();
        root = huffEncd1.getHuffmanTreeRoot();
        huffmanBinaryCodes = huffEncd1.getHuffmanCodes(root, new String());
        
        System.out.println("Huffman Codes for the First String.....:");
        it = huffmanBinaryCodes.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Character, String> entry = it.next();
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }
        System.out.println("\n");
        
        testString = "gghhiajjjjjkabbbbcccakjlabcjsdbhcjhsbdjchbdsjchbdsjhbcsdhbcjkhsbdcjhbsdjbcjksdhbcjhbsdcjhbsdjchbsdjhbcjdshbcjkdshbjchbsdjhbcjsdhbcjdshbcjkhbsdjchbsdjbcjdsksnckjsdnckjnsdkcjndskjcndsknjsdkjcnksdjncksdnckjnsdkcnsdkcnanfcdaaeeeefaaaaabbccdabbbdascknakcsaclkasjcbkmas  dddfffgiiijccjj";
        HuffmanEncoding huffEncd2 = new HuffmanEncoding();
        huffEncd2.getCharFreq(testString);
        huffEncd2.bldCharNodesPQ();
        huffEncd2.bldHuffmanTree();
        root = huffEncd2.getHuffmanTreeRoot();
        huffmanBinaryCodes = huffEncd2.getHuffmanCodes(root, new String());
        
        System.out.println("Huffman Codes for the Second String.....:");
        it = huffmanBinaryCodes.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Character, String> entry = it.next();
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }
        System.out.println("\n");
    }
}