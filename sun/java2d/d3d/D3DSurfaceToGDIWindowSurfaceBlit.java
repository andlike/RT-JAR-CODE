/*     */ package sun.java2d.d3d;
/*     */ 
/*     */ import java.awt.Composite;
/*     */ import sun.java2d.SurfaceData;
/*     */ import sun.java2d.loops.Blit;
/*     */ import sun.java2d.loops.CompositeType;
/*     */ import sun.java2d.pipe.Region;
/*     */ import sun.java2d.windows.GDIWindowSurfaceData;
/*     */ 
/*     */ class D3DSurfaceToGDIWindowSurfaceBlit extends Blit
/*     */ {
/*     */   D3DSurfaceToGDIWindowSurfaceBlit()
/*     */   {
/* 789 */     super(D3DSurfaceData.D3DSurface, CompositeType.AnyAlpha, GDIWindowSurfaceData.AnyGdi);
/*     */   }
/*     */ 
/*     */   public void Blit(SurfaceData paramSurfaceData1, SurfaceData paramSurfaceData2, Composite paramComposite, Region paramRegion, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/* 799 */     D3DVolatileSurfaceManager.handleVItoScreenOp(paramSurfaceData1, paramSurfaceData2);
/*     */   }
/*     */ }

/* Location:           C:\Program Files\Java\jdk1.7.0_79\jre\lib\rt.jar
 * Qualified Name:     sun.java2d.d3d.D3DSurfaceToGDIWindowSurfaceBlit
 * JD-Core Version:    0.6.2
 */