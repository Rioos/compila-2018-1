/* Generated By:JavaCC: Do not edit this line. FunTokenManager.java */
package parser;
import java.io.*;
import recovery.*;

public class FunTokenManager implements FunConstants
{
  int countLexError = 0;

  public int foundLexError() {
    return countLexError;
  }
  public  java.io.PrintStream debugStream = System.out;
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x100800L) != 0L)
         {
            jjmatchedKind = 54;
            return 14;
         }
         if ((active0 & 0x200078006ff7c0L) != 0L)
         {
            jjmatchedKind = 54;
            return 17;
         }
         if ((active0 & 0x1000000L) != 0L)
            return 5;
         return -1;
      case 1:
         if ((active0 & 0x200038007fefc0L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 1;
            return 17;
         }
         if ((active0 & 0x4000001000L) != 0L)
            return 17;
         return -1;
      case 2:
         if ((active0 & 0x3800006800L) != 0L)
            return 17;
         if ((active0 & 0x200000007f87c0L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 2;
            return 17;
         }
         return -1;
      case 3:
         if ((active0 & 0x5e85c0L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 3;
            return 17;
         }
         if ((active0 & 0x20000000210200L) != 0L)
            return 17;
         return -1;
      case 4:
         if ((active0 & 0x460500L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 4;
            return 17;
         }
         if ((active0 & 0x1880c0L) != 0L)
            return 17;
         return -1;
      case 5:
         if ((active0 & 0x60000L) != 0L)
            return 17;
         if ((active0 & 0x400500L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 5;
            return 17;
         }
         return -1;
      case 6:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 6;
            return 17;
         }
         if ((active0 & 0x400400L) != 0L)
            return 17;
         return -1;
      case 7:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 7;
            return 17;
         }
         return -1;
      case 8:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 8;
            return 17;
         }
         return -1;
      case 9:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 9;
            return 17;
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
private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private final int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private final int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         return jjMoveStringLiteralDfa1_0(0x400000000L);
      case 37:
         return jjStopAtPos(0, 27);
      case 40:
         return jjStopAtPos(0, 39);
      case 41:
         return jjStopAtPos(0, 40);
      case 42:
         return jjStopAtPos(0, 25);
      case 43:
         return jjStopAtPos(0, 23);
      case 44:
         return jjStopAtPos(0, 46);
      case 45:
         return jjStartNfaWithStates_0(0, 24, 5);
      case 46:
         return jjStopAtPos(0, 47);
      case 47:
         jjmatchedKind = 26;
         return jjMoveStringLiteralDfa1_0(0x1200000000000000L);
      case 59:
         return jjStopAtPos(0, 45);
      case 60:
         jjmatchedKind = 30;
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 61:
         jjmatchedKind = 28;
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 62:
         jjmatchedKind = 29;
         return jjMoveStringLiteralDfa1_0(0x200000000L);
      case 91:
         return jjStopAtPos(0, 43);
      case 93:
         return jjStopAtPos(0, 44);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x400040L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x200180L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x600L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x100800L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x3000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x20000800004000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x30000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0xc0000L);
      case 120:
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 123:
         return jjStopAtPos(0, 41);
      case 125:
         return jjStopAtPos(0, 42);
      default :
         return jjMoveNfa_0(4, 0);
   }
}
private final int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x200000000000000L) != 0L)
            return jjStopAtPos(1, 57);
         break;
      case 47:
         if ((active0 & 0x1000000000000000L) != 0L)
            return jjStopAtPos(1, 60);
         break;
      case 61:
         if ((active0 & 0x80000000L) != 0L)
            return jjStopAtPos(1, 31);
         else if ((active0 & 0x100000000L) != 0L)
            return jjStopAtPos(1, 32);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(1, 33);
         else if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(1, 34);
         break;
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x34000L);
      case 102:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(1, 12, 17);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x100280L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000002000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x2800400900L);
      case 114:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 38, 17);
         return jjMoveStringLiteralDfa2_0(active0, 0x8040L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000080000L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private final int jjMoveStringLiteralDfa2_0(long old0, long active0)
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
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x210080L);
      case 100:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 36, 17);
         break;
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x40L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000000000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x500000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      case 114:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(2, 11, 17);
         else if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 37, 17);
         return jjMoveStringLiteralDfa3_0(active0, 0x40000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 116:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(2, 13, 17);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(2, 35, 17);
         return jjMoveStringLiteralDfa3_0(active0, 0x20400L);
      case 119:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(2, 14, 17);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private final int jjMoveStringLiteralDfa3_0(long old0, long active0)
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
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x100040L);
      case 100:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(3, 16, 17);
         break;
      case 101:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(3, 9, 17);
         return jjMoveStringLiteralDfa4_0(active0, 0x80400L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
      case 108:
         if ((active0 & 0x20000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 53, 17);
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000L);
      case 114:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(3, 21, 17);
         break;
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x180L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private final int jjMoveStringLiteralDfa4_0(long old0, long active0)
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
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000L);
      case 107:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(4, 6, 17);
         break;
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x40400L);
      case 114:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(4, 19, 17);
         return jjMoveStringLiteralDfa5_0(active0, 0x20000L);
      case 115:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(4, 7, 17);
         break;
      case 116:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(4, 15, 17);
         else if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(4, 20, 17);
         return jjMoveStringLiteralDfa5_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private final int jjMoveStringLiteralDfa5_0(long old0, long active0)
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
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x400000L);
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x400L);
      case 103:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(5, 18, 17);
         break;
      case 110:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(5, 17, 17);
         break;
      case 114:
         return jjMoveStringLiteralDfa6_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private final int jjMoveStringLiteralDfa6_0(long old0, long active0)
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
      case 110:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(6, 22, 17);
         break;
      case 115:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(6, 10, 17);
         break;
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private final int jjMoveStringLiteralDfa7_0(long old0, long active0)
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
      case 99:
         return jjMoveStringLiteralDfa8_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private final int jjMoveStringLiteralDfa8_0(long old0, long active0)
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
      case 116:
         return jjMoveStringLiteralDfa9_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private final int jjMoveStringLiteralDfa9_0(long old0, long active0)
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
      case 111:
         return jjMoveStringLiteralDfa10_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private final int jjMoveStringLiteralDfa10_0(long old0, long active0)
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
      case 114:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(10, 8, 17);
         break;
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
private final void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private final void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private final void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}
private final void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}
private final void jjCheckNAddStates(int start)
{
   jjCheckNAdd(jjnextStates[start]);
   jjCheckNAdd(jjnextStates[start + 1]);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private final int jjMoveNfa_0(int startState, int curPos)
{
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 41;
   int i = 1;
   jjstateSet[0] = startState;
   int j, kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 14:
               case 17:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 54)
                     kind = 54;
                  jjCheckNAdd(17);
                  break;
               case 4:
                  if ((0x84000058ffffc9ffL & l) != 0L)
                  {
                     if (kind > 63)
                        kind = 63;
                     jjCheckNAdd(18);
                  }
                  else if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 48)
                        kind = 48;
                     jjCheckNAddStates(0, 4);
                  }
                  else if (curChar == 39)
                     jjCheckNAddStates(5, 9);
                  else if (curChar == 34)
                     jjCheckNAddStates(10, 15);
                  else if (curChar == 45)
                     jjCheckNAdd(5);
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(0, 1);
                  if ((0x3000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(2, 3);
                  break;
               case 0:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(0, 1);
                  break;
               case 2:
                  if ((0x3000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(2, 3);
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(5, 6);
                  break;
               case 6:
                  if (curChar == 46)
                     jjCheckNAdd(7);
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAdd(7);
                  break;
               case 18:
                  if ((0x84000058ffffc9ffL & l) == 0L)
                     break;
                  if (kind > 63)
                     kind = 63;
                  jjCheckNAdd(18);
                  break;
               case 19:
                  if (curChar == 34)
                     jjCheckNAddStates(10, 15);
                  break;
               case 20:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddStates(16, 18);
                  break;
               case 22:
                  if (curChar == 34)
                     jjCheckNAddStates(16, 18);
                  break;
               case 23:
                  if (curChar == 34 && kind > 49)
                     kind = 49;
                  break;
               case 24:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddStates(19, 21);
                  break;
               case 26:
                  if (curChar == 34)
                     jjCheckNAddStates(19, 21);
                  break;
               case 27:
                  if ((0x2400L & l) != 0L && kind > 65)
                     kind = 65;
                  break;
               case 28:
                  if (curChar == 39)
                     jjCheckNAddStates(5, 9);
                  break;
               case 29:
                  if ((0xffffff7fffffdbffL & l) != 0L)
                     jjCheckNAdd(30);
                  break;
               case 30:
                  if (curChar == 39 && kind > 50)
                     kind = 50;
                  break;
               case 32:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAdd(30);
                  break;
               case 33:
                  if ((0xffffff7fffffdbffL & l) != 0L)
                     jjCheckNAddStates(22, 24);
                  break;
               case 35:
                  if (curChar == 39)
                     jjCheckNAddStates(22, 24);
                  break;
               case 36:
                  if ((0x2400L & l) != 0L && kind > 64)
                     kind = 64;
                  break;
               case 37:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 48)
                     kind = 48;
                  jjCheckNAddStates(0, 4);
                  break;
               case 38:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 48)
                     kind = 48;
                  jjCheckNAdd(38);
                  break;
               case 39:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(39, 40);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 14:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 54)
                        kind = 54;
                     jjCheckNAdd(17);
                  }
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 4:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 54)
                        kind = 54;
                     jjCheckNAdd(17);
                  }
                  else if ((0xd0000001d0000001L & l) != 0L)
                  {
                     if (kind > 63)
                        kind = 63;
                     jjCheckNAdd(18);
                  }
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 14;
                  else if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 1:
                  if ((0x800000008000L & l) != 0L && kind > 48)
                     kind = 48;
                  break;
               case 3:
                  if ((0x400000004L & l) != 0L && kind > 48)
                     kind = 48;
                  break;
               case 8:
                  if (curChar == 101 && kind > 52)
                     kind = 52;
                  break;
               case 9:
                  if (curChar == 117)
                     jjCheckNAdd(8);
                  break;
               case 10:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 11:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if (curChar == 115)
                     jjCheckNAdd(8);
                  break;
               case 13:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 15:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 16:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 54)
                     kind = 54;
                  jjCheckNAdd(17);
                  break;
               case 17:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 54)
                     kind = 54;
                  jjCheckNAdd(17);
                  break;
               case 18:
                  if ((0xd0000001d0000001L & l) == 0L)
                     break;
                  if (kind > 63)
                     kind = 63;
                  jjCheckNAdd(18);
                  break;
               case 20:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(16, 18);
                  break;
               case 21:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 22:
                  if ((0x14400010000000L & l) != 0L)
                     jjCheckNAddStates(16, 18);
                  break;
               case 24:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(19, 21);
                  break;
               case 25:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 26:
                  if ((0x14400010000000L & l) != 0L)
                     jjCheckNAddStates(19, 21);
                  break;
               case 29:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAdd(30);
                  break;
               case 31:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 32:
                  if ((0x14400010000000L & l) != 0L)
                     jjCheckNAdd(30);
                  break;
               case 33:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(22, 24);
                  break;
               case 34:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 35;
                  break;
               case 35:
                  if ((0x14400010000000L & l) != 0L)
                     jjCheckNAddStates(22, 24);
                  break;
               case 39:
                  if ((0x7e0000007eL & l) != 0L)
                     jjAddStates(25, 26);
                  break;
               case 40:
                  if ((0x10000000100L & l) != 0L && kind > 48)
                     kind = 48;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 4:
               case 18:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 63)
                     kind = 63;
                  jjCheckNAdd(18);
                  break;
               case 20:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(16, 18);
                  break;
               case 24:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(19, 21);
                  break;
               case 29:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 33:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(22, 24);
                  break;
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
      if ((i = jjnewStateCnt) == (startsAt = 41 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private final int jjMoveStringLiteralDfa0_2()
{
   return jjMoveNfa_2(0, 0);
}
private final int jjMoveNfa_2(int startState, int curPos)
{
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 1;
   int i = 1;
   jjstateSet[0] = startState;
   int j, kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x2400L & l) != 0L)
                     kind = 61;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
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
      if ((i = jjnewStateCnt) == (startsAt = 1 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private final int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_1(0x400000000000000L);
      default :
         return 1;
   }
}
private final int jjMoveStringLiteralDfa1_1(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x400000000000000L) != 0L)
            return jjStopAtPos(1, 58);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
   38, 39, 40, 5, 6, 29, 31, 33, 34, 36, 20, 21, 23, 24, 25, 27, 
   20, 21, 23, 24, 25, 27, 33, 34, 36, 39, 40, 
};
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, "\142\162\145\141\153", 
"\143\154\141\163\163", "\143\157\156\163\164\162\165\143\164\157\162", "\145\154\163\145", 
"\145\170\164\145\156\144\163", "\146\157\162", "\151\146", "\151\156\164", "\156\145\167", 
"\160\162\151\156\164", "\162\145\141\144", "\162\145\164\165\162\156", "\163\164\162\151\156\147", 
"\163\165\160\145\162", "\146\154\157\141\164", "\143\150\141\162", "\142\157\157\154\145\141\156", 
"\53", "\55", "\52", "\57", "\45", "\75", "\76", "\74", "\75\75", "\74\75", "\76\75", 
"\41\75", "\156\157\164", "\141\156\144", "\170\157\162", "\157\162", "\50", "\51", 
"\173", "\175", "\133", "\135", "\73", "\54", "\56", null, null, null, null, null, 
"\156\165\154\154", null, null, null, null, null, null, null, null, null, null, null, null, };
public static final String[] lexStateNames = {
   "DEFAULT", 
   "multilinecomment", 
   "singlelinecommnet", 
};
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, 1, 0, -1, 2, 0, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x7fffffffffffc1L, 0x0L, 
};
static final long[] jjtoSkip = {
   0xfe0000000000003eL, 0x3L, 
};
static final long[] jjtoSpecial = {
   0x8000000000000000L, 0x3L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[41];
private final int[] jjstateSet = new int[82];
StringBuffer image;
int jjimageLen;
int lengthOfMatch;
protected char curChar;
public FunTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}
public FunTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private final void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 41; i-- > 0;)
      jjrounds[i] = 0x80000000;
}
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
public void SwitchTo(int lexState)
{
   if (lexState >= 3 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   Token t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   String im = jjstrLiteralImages[jjmatchedKind];
   t.image = (im == null) ? input_stream.GetImage() : im;
   t.beginLine = input_stream.getBeginLine();
   t.beginColumn = input_stream.getBeginColumn();
   t.endLine = input_stream.getEndLine();
   t.endColumn = input_stream.getEndColumn();
   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

public Token getNextToken() 
{
  int kind;
  Token specialToken = null;
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
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }
   image = null;
   jjimageLen = 0;

   switch(curLexState)
   {
     case 0:
       try { input_stream.backup(0);
          while (curChar <= 32 && (0x100003600L & (1L << curChar)) != 0L)
             curChar = input_stream.BeginToken();
       }
       catch (java.io.IOException e1) { continue EOFLoop; }
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_0();
       break;
     case 1:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_1();
       if (jjmatchedPos == 0 && jjmatchedKind > 59)
       {
          jjmatchedKind = 59;
       }
       break;
     case 2:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_2();
       if (jjmatchedPos == 0 && jjmatchedKind > 62)
       {
          jjmatchedKind = 62;
       }
       break;
   }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           matchedToken.specialToken = specialToken;
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else
        {
           if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
           {
              matchedToken = jjFillToken();
              if (specialToken == null)
                 specialToken = matchedToken;
              else
              {
                 matchedToken.specialToken = specialToken;
                 specialToken = (specialToken.next = matchedToken);
              }
              SkipLexicalActions(matchedToken);
           }
           else 
              SkipLexicalActions(null);
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
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

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 63 :
         if (image == null)
            image = new StringBuffer();
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          System.err.println("Line " + input_stream.getEndLine() + " - Invalid string found: " + image);
          countLexError++;
         break;
      case 64 :
         if (image == null)
            image = new StringBuffer();
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          System.err.println("Line " + input_stream.getEndLine() + " - Char constant has a : " + image);
          countLexError++;
         break;
      case 65 :
         if (image == null)
            image = new StringBuffer();
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          System.err.println("Line " + input_stream.getEndLine() + " - String constant has a : " + image);
          countLexError++;
         break;
      default :
         break;
   }
}
}
