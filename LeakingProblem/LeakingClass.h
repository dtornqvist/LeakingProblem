#import <Foundation/Foundation.h>
#import <KotlinNativeFramework/KotlinNativeFramework.h>


@interface LeakingClass : NSObject<KNFKotlinNativeFrameworkListener>

-(void)start;

@end
