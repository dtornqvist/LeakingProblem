#import "LeakingClass.h"

@interface LeakingClass()

@property (nonatomic, strong) KNFKotlinNativeFramework *knf;

@end


@implementation LeakingClass

-(void)start
{
    _knf = [KNFKotlinNativeFramework new];
    self.knf.listener = self;
    [self.knf giveMeDoubles];
}

- (void)listenToDoublesList:(NSArray<KNFDouble *> *)list {}

@end
