/* Generated By:JavaCC: Do not edit this line. RobotTokenManager.java */
package uniandes.lym.robot.control;
import uniandes.lym.robot.kernel.*;
import uniandes.lym.robot.view.Console;
import java.awt.Point;
import java.io.*;
import java.util.Vector;
import java.util.LinkedList;
import java.util.Hashtable;

/** Token Manager. */
public class RobotTokenManager implements RobotConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x7ffffffffe60L) != 0L)
         {
            jjmatchedKind = 49;
            return 4;
         }
         return -1;
      case 1:
         if ((active0 & 0x7feefffffe60L) != 0L)
         {
            jjmatchedKind = 49;
            jjmatchedPos = 1;
            return 4;
         }
         if ((active0 & 0x1100000000L) != 0L)
            return 4;
         return -1;
      case 2:
         if ((active0 & 0x60080000L) != 0L)
            return 4;
         if ((active0 & 0x7fee9ff7fe60L) != 0L)
         {
            jjmatchedKind = 49;
            jjmatchedPos = 2;
            return 4;
         }
         return -1;
      case 3:
         if ((active0 & 0x4d681817fc60L) != 0L)
         {
            if (jjmatchedPos != 3)
            {
               jjmatchedKind = 49;
               jjmatchedPos = 3;
            }
            return 4;
         }
         if ((active0 & 0x328687e00200L) != 0L)
            return 4;
         return -1;
      case 4:
         if ((active0 & 0x40201e17f820L) != 0L)
         {
            jjmatchedKind = 49;
            jjmatchedPos = 4;
            return 4;
         }
         if ((active0 & 0xd4800000440L) != 0L)
            return 4;
         return -1;
      case 5:
         if ((active0 & 0x800L) != 0L)
         {
            if (jjmatchedPos < 4)
            {
               jjmatchedKind = 49;
               jjmatchedPos = 4;
            }
            return -1;
         }
         if ((active0 & 0x1e17c020L) != 0L)
         {
            jjmatchedKind = 49;
            jjmatchedPos = 5;
            return 4;
         }
         if ((active0 & 0x402000003000L) != 0L)
            return 4;
         return -1;
      case 6:
         if ((active0 & 0x1e178020L) != 0L)
         {
            jjmatchedKind = 49;
            jjmatchedPos = 6;
            return 4;
         }
         if ((active0 & 0x800L) != 0L)
         {
            if (jjmatchedPos < 4)
            {
               jjmatchedKind = 49;
               jjmatchedPos = 4;
            }
            return -1;
         }
         if ((active0 & 0x4000L) != 0L)
            return 4;
         return -1;
      case 7:
         if ((active0 & 0x1e078000L) != 0L)
         {
            jjmatchedKind = 49;
            jjmatchedPos = 7;
            return 4;
         }
         if ((active0 & 0x100020L) != 0L)
            return 4;
         return -1;
      case 8:
         if ((active0 & 0x78000L) != 0L)
         {
            jjmatchedKind = 49;
            jjmatchedPos = 8;
            return 4;
         }
         if ((active0 & 0x1e000000L) != 0L)
            return 4;
         return -1;
      case 9:
         if ((active0 & 0x78000L) != 0L)
         {
            jjmatchedKind = 49;
            jjmatchedPos = 9;
            return 4;
         }
         return -1;
      case 10:
         if ((active0 & 0x78000L) != 0L)
         {
            jjmatchedKind = 49;
            jjmatchedPos = 10;
            return 4;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 44:
         return jjStopAtPos(0, 50);
      case 58:
         return jjStopAtPos(0, 55);
      case 59:
         return jjStopAtPos(0, 51);
      case 91:
         return jjStopAtPos(0, 52);
      case 93:
         return jjStopAtPos(0, 54);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa1_0(0x400000100000L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa1_0(0x20000000020L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_0(0x7e040L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x100400000000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x4001001000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 74:
      case 106:
         return jjMoveStringLiteralDfa1_0(0x18000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa1_0(0x8000000000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa1_0(0x6400000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa1_0(0x40020080000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0xc0000400L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x12000000800L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x80000000000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x200800000L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa1_0(0x200800000000L);
      case 124:
         return jjStopAtPos(0, 53);
      default :
         return jjMoveNfa_0(3, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x12000107f220L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x20a000000000L);
      case 70:
      case 102:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(1, 32, 4);
         break;
      case 72:
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0xa00000040L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x10080000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000L);
      case 79:
      case 111:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 36, 4);
         return jjMoveStringLiteralDfa2_0(active0, 0xc0026680800L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x404000000400L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x58800000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 66:
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x20081001000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000040L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x20L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x18000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x7e000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x404000000400L);
      case 80:
      case 112:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(2, 29, 4);
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000800200L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x300400100000L);
      case 84:
      case 116:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(2, 19, 4);
         else if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(2, 30, 4);
         return jjMoveStringLiteralDfa3_0(active0, 0x200000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000000L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa3_0(active0, 0x6400000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 67:
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 69:
      case 101:
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 22;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(3, 24, 4);
         else if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(3, 34, 4);
         return jjMoveStringLiteralDfa4_0(active0, 0x2006000000L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x101000L);
      case 74:
      case 106:
         return jjMoveStringLiteralDfa4_0(active0, 0x50000L);
      case 75:
      case 107:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(3, 31, 4);
         else if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 41, 4);
         break;
      case 76:
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000020L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa4_0(active0, 0x28000L);
      case 78:
      case 110:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(3, 23, 4);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(3, 33, 4);
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000000L);
      case 79:
      case 111:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(3, 21, 4);
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa4_0(active0, 0x18006040L);
      case 83:
      case 115:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(3, 9, 4);
         break;
      case 84:
      case 116:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 39, 4);
         else if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 44, 4);
         else if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 45, 4);
         return jjMoveStringLiteralDfa4_0(active0, 0xc0000000000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000000000L);
      case 69:
      case 101:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(4, 35, 4);
         break;
      case 71:
      case 103:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000L);
      case 72:
      case 104:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 42, 4);
         else if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 43, 4);
         break;
      case 73:
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x14004000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000001000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa5_0(active0, 0x28020L);
      case 83:
      case 115:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(4, 6, 4);
         else if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(4, 10, 4);
         break;
      case 84:
      case 116:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 38, 4);
         else if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 40, 4);
         return jjMoveStringLiteralDfa5_0(active0, 0xa000800L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x52000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 95:
         return jjMoveStringLiteralDfa6_0(active0, 0x800L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000L);
      case 68:
      case 100:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 46, 4);
         break;
      case 71:
      case 103:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(5, 12, 4);
         break;
      case 77:
      case 109:
         return jjMoveStringLiteralDfa6_0(active0, 0x50000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x14100000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa6_0(active0, 0xa000020L);
      case 84:
      case 116:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(5, 13, 4);
         else if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 37, 4);
         break;
      case 86:
      case 118:
         return jjMoveStringLiteralDfa6_0(active0, 0x28000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 68:
      case 100:
         return jjMoveStringLiteralDfa7_0(active0, 0x14000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x28000L);
      case 75:
      case 107:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(6, 14, 4);
         break;
      case 78:
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x20L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa7_0(active0, 0x50000L);
      case 82:
      case 114:
         if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(6, 11);
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0xa100000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 72:
      case 104:
         return jjMoveStringLiteralDfa8_0(active0, 0xa000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa8_0(active0, 0x14018000L);
      case 79:
      case 111:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(7, 20, 4);
         break;
      case 83:
      case 115:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(7, 5, 4);
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa8_0(active0, 0x60000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(8, 25, 4);
         else if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(8, 27, 4);
         break;
      case 78:
      case 110:
         return jjMoveStringLiteralDfa9_0(active0, 0x18000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa9_0(active0, 0x60000L);
      case 82:
      case 114:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(8, 26, 4);
         else if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(8, 28, 4);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 68:
      case 100:
         return jjMoveStringLiteralDfa10_0(active0, 0x18000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa10_0(active0, 0x60000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 72:
      case 104:
         return jjMoveStringLiteralDfa11_0(active0, 0x60000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa11_0(active0, 0x18000L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(11, 17, 4);
         else if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(11, 18, 4);
         break;
      case 82:
      case 114:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(11, 15, 4);
         else if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(11, 16, 4);
         break;
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 3;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAdd(0);
                  break;
               case 4:
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 49)
                     kind = 49;
                  jjCheckNAddTwoStates(1, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
               case 1:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  kind = 49;
                  jjCheckNAddTwoStates(1, 2);
                  break;
               case 4:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  kind = 49;
                  jjCheckNAddTwoStates(1, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 3 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, "\54", "\73", "\133", "\174", 
"\135", "\72", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xfe7ffffffffee1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[3];
private final int[] jjstateSet = new int[6];
protected char curChar;
/** Constructor. */
public RobotTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public RobotTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 3; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
