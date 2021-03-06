/*     */ package com.sun.org.apache.bcel.internal.generic;
/*     */ 
/*     */ import com.sun.org.apache.bcel.internal.util.ByteSequence;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.IOException;
/*     */ 
/*     */ public class GOTO_W extends GotoInstruction
/*     */ {
/*     */   GOTO_W()
/*     */   {
/*     */   }
/*     */ 
/*     */   public GOTO_W(InstructionHandle target)
/*     */   {
/*  76 */     super((short)200, target);
/*  77 */     this.length = 5;
/*     */   }
/*     */ 
/*     */   public void dump(DataOutputStream out)
/*     */     throws IOException
/*     */   {
/*  85 */     this.index = getTargetOffset();
/*  86 */     out.writeByte(this.opcode);
/*  87 */     out.writeInt(this.index);
/*     */   }
/*     */ 
/*     */   protected void initFromFile(ByteSequence bytes, boolean wide)
/*     */     throws IOException
/*     */   {
/*  95 */     this.index = bytes.readInt();
/*  96 */     this.length = 5;
/*     */   }
/*     */ 
/*     */   public void accept(Visitor v)
/*     */   {
/* 108 */     v.visitUnconditionalBranch(this);
/* 109 */     v.visitBranchInstruction(this);
/* 110 */     v.visitGotoInstruction(this);
/* 111 */     v.visitGOTO_W(this);
/*     */   }
/*     */ }

/* Location:           C:\Program Files\Java\jdk1.7.0_79\jre\lib\rt.jar
 * Qualified Name:     com.sun.org.apache.bcel.internal.generic.GOTO_W
 * JD-Core Version:    0.6.2
 */